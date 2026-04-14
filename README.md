# Live coding interview practice

This repository is for practicing coding interview problems and validating solutions with automated unit tests. Implement a function, run the test suite, and iterate—similar to how many interviews use a REPL or runner, but repeatable.

## Languages

- **Python** (`python/`) — pytest
- **Java** (`java/`) — Maven, JUnit 5
- **TypeScript** (`typescript/`) — Node.js, Vitest

## Problem patterns covered

The starter set maps to common interview themes:

- Hash maps / frequency counting
- Arrays and sorted search
- String parsing and normalization
- Two pointers
- Stack and queue patterns
- Basic recursion

Track what you have solved in each language in [`problems.md`](problems.md). Starter problems are pre-checked; update the table as you add or redo exercises.

## Running tests with Make

The repo includes a root [`Makefile`](Makefile) so you can run tests without `cd`-ing into each language folder. Run everything from the **repository root**.

### Prerequisites (once per machine)

- **Java:** JDK 17+ and Maven (`mvn` on your `PATH`).
- **Python:** For the full suite, create a venv and install pytest (see [`python/README.md`](python/README.md)). The Makefile uses `python/.venv/bin/pytest` when that path exists; otherwise it runs `python3 -m pytest` (on some systems you need the venv because of PEP 668).
- **TypeScript:** In `typescript/`, run `npm install` once so `npm test` / `npx vitest` work.

### Run all tests in one language

```bash
make java          # Maven: all JUnit tests in java/
make python        # pytest: all tests under python/tests/
make typescript    # Vitest: npm test in typescript/
```

### Run everything (all three languages)

```bash
make all
```

This runs **Java**, then **Python**, then **TypeScript** in order and stops on the first failure.

### Run a single test class or file

You can pass a focused target in two equivalent ways: the **`TEST=` variable** or a **hyphenated fake target** (class/file stem only).

**Java** — Maven `-Dtest=` accepts the test class name (no `.java`):

```bash
make java TEST=TwoSumTest
make java-TwoSumTest
```

**Python** — `TEST` can be a short slug (matches `tests/test_<slug>.py`), a `test_*.py` name, or any path that contains `/` (used as-is under `python/`):

```bash
make python TEST=two_sum
make python-two_sum
make python TEST=tests/test_two_sum.py
```

**TypeScript** — `TEST` can be the file stem (matches `tests/<stem>.test.ts`) or a path ending in `.ts` / containing `/`:

```bash
make typescript TEST=twoSum
make typescript-twoSum
make typescript TEST=tests/twoSum.test.ts
```

### Make quirk: `make java SomeTest` does not work

GNU Make treats extra words on the command line as **additional targets**, not arguments to `java`. Use `make java TEST=SomeTest` or `make java-SomeTest` instead.

For more examples, see the comments at the top of [`Makefile`](Makefile). Manual commands (without Make) are in each language’s README.

## Add a new problem

1. Pick a category folder (e.g. `arrays/`, `hash_maps/`) or add one for new topics (trees, graphs, etc.).
2. Copy the **template** in that language:
   - Python: `python/src/_template/new_problem.py` and `python/tests/_template/test_new_problem.py`
   - Java: `com.example.livecoding.template.NewProblem` (+ optional `NewProblemTest` in `template/`)
   - TypeScript: `typescript/src/_template/newProblem.ts` (copy `tests/_template/newProblem.test.ts` to a new `tests/*.test.ts` file; `_template` tests are excluded from `npm test`)
3. Rename, implement, and add tests beside existing problems.
4. Update `problems.md` with a new row and checkboxes.

## Repository layout

- `README.md` — this file
- `Makefile` — run tests via `make java`, `make python`, `make typescript`, etc.
- `problems.md` — tracker by language
- `python/` — pytest, `src/` + `tests/`
- `java/` — Maven standard layout
- `typescript/` — Vitest, `src/` + `tests/`

Each language README lists prerequisites, install steps, and exact test commands.
