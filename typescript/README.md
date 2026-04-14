# TypeScript (Vitest)

## Prerequisites

- Node.js 20+ (or 18+ with fetch; LTS recommended)

## Setup

```bash
cd typescript
npm install
```

## Run tests

```bash
npm test
```

Watch mode:

```bash
npm run test:watch
```

## Layout

- **Implementations:** `src/<area>/` (e.g. `src/hash_maps/twoSum.ts`)
- **Tests:** `tests/<name>.test.ts`
- **New problems:** copy `src/_template/newProblem.ts` and `tests/_template/newProblem.test.ts`, then rename and implement.
