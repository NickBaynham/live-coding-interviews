# Live coding interview practice — run tests from the repo root.
#
# All tests in one language:
#   make java
#   make python
#   make typescript
#
# Single test file / class (pick one style):
#   make java TEST=TwoSumTest
#   make java-TwoSumTest
#
# GNU Make treats extra words as separate targets, so "make java TwoSumTest"
# does not pass TwoSumTest into the java recipe; use TEST= or the hyphen form.
#
# Python TEST: slug (two_sum), test module name (test_two_sum), or path (tests/...).
#   Uses python/.venv/bin/pytest when present; otherwise python3 -m pytest (PEP 668 may require a venv).
# TypeScript TEST: stem (twoSum) or path (tests/twoSum.test.ts).

.PHONY: all java python typescript
.PHONY: java-% python-% typescript-%

all: java python typescript

java:
	@cd java && \
	if [ -n "$(TEST)" ]; then \
	  t="$(TEST)"; t="$${t%.java}"; \
	  mvn -q test -Dtest="$$t"; \
	else \
	  mvn -q test; \
	fi

python:
	@cd python && \
	PY_RUN=$$(if [ -x .venv/bin/pytest ]; then echo .venv/bin/pytest; else echo python3 -m pytest; fi); \
	if [ -n "$(TEST)" ]; then \
	  case "$(TEST)" in \
	    */*)       $$PY_RUN "$(TEST)" ;; \
	    *.py)      $$PY_RUN "tests/$(TEST)" ;; \
	    test_*)    $$PY_RUN "tests/$(TEST).py" ;; \
	    *)         $$PY_RUN "tests/test_$(TEST).py" ;; \
	  esac; \
	else \
	  $$PY_RUN; \
	fi

typescript:
	@cd typescript && \
	if [ -n "$(TEST)" ]; then \
	  case "$(TEST)" in \
	    */*)  npx vitest run "$(TEST)" ;; \
	    *.ts) npx vitest run "tests/$(TEST)" ;; \
	    *)    npx vitest run "tests/$(TEST).test.ts" ;; \
	  esac; \
	else \
	  npm test; \
	fi

# Hyphen style: make java-TwoSumTest  →  same as  make java TEST=TwoSumTest
java-%:
	@cd java && mvn -q test -Dtest=$(subst .java,,$*)

python-%:
	@cd python && \
	PY_RUN=$$(if [ -x .venv/bin/pytest ]; then echo .venv/bin/pytest; else echo python3 -m pytest; fi); \
	$$PY_RUN tests/test_$*.py

typescript-%:
	@cd typescript && npx vitest run tests/$*.test.ts
