# Python (pytest)

## Prerequisites

- Python 3.10+ recommended

## Setup

```bash
cd python
python -m venv .venv
source .venv/bin/activate   # Windows: .venv\Scripts\activate
pip install -r requirements.txt
```

## Run tests

```bash
pytest
```

Run a single file:

```bash
pytest tests/test_two_sum.py
```

## Layout

- **Implementations:** `src/<category>/` (e.g. `src/hash_maps/two_sum.py`)
- **Tests:** `tests/test_<name>.py`
- **New problems:** copy `src/_template/new_problem.py` and `tests/_template/test_new_problem.py`, then rename and fill in.

Imports use `pythonpath = src`, so tests do `from hash_maps.two_sum import two_sum`.
