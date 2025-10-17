# Advent of Clojure

Solutions for [Advent of Code](https://adventofcode.com) puzzles, written in Clojure. Each namespace corresponds to a specific year and day, e.g. `aoc2015.day01` -> **2015, Day 1 - "Not Quite Lisp"**

---

## Goals

... in no particular order

- Solving as many Advent of Code problems as I can
- Improving my knowledge of data structures and algorithms
- Learning Clojure 
- Writing idiomatic Clojure
- Having fun and distracting myself from real life for a while!

## Solutions

| Day | 2015 | 2016 | 2017 | 2018 | 2019 | 2020 | 2021 | 2022 | 2023 | 2024 | Total |
| --: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | ----: |
|   1 |  **  |      |  **  |      |  **  |      |      |      |      |      |       |
|   2 |  **  |      |      |      |      |      |      |      |      |      |       |
|   3 |  **  |      |      |      |      |      |      |      |      |      |       |
|   4 |      |      |      |      |      |      |      |      |      |      |       |
|   5 |  **  |      |      |      |      |      |      |      |      |      |       |
|   6 |      |      |      |      |      |      |      |      |      |      |       |
|   7 |      |      |      |      |      |      |      |      |      |      |       |
|   8 |      |      |      |      |      |      |      |      |      |      |       |
|   9 |      |      |      |      |      |      |      |      |      |      |       |
|  10 |      |      |      |      |      |      |      |      |      |      |       |
|  11 |      |      |      |      |      |      |      |      |      |      |       |
|  12 |      |      |      |      |      |      |      |      |      |      |       |
|  13 |      |      |      |      |      |      |      |      |      |      |       |
|  14 |      |      |      |      |      |      |      |      |      |      |       |
|  15 |      |      |      |      |      |      |      |      |      |      |       |
|  16 |      |      |      |      |      |      |      |      |      |      |       |
|  17 |      |      |      |      |      |      |      |      |      |      |       |
|  18 |      |      |      |      |      |      |      |      |      |      |       |
|  19 |      |      |      |      |      |      |      |      |      |      |       |
|  20 |      |      |      |      |      |      |      |      |      |      |       |
|  21 |      |      |      |      |      |      |      |      |      |      |       |
|  22 |      |      |      |      |      |      |      |      |      |      |       |
|  23 |      |      |      |      |      |      |      |      |      |      |       |
|  24 |      |      |      |      |      |      |      |      |      |      |       |
|  25 |      |      |      |      |      |      |      |      |      |      |       |
| Tot |      |      |      |      |      |      |      |      |      |      |       |
  
## Structure

TODO: add directory structure

Each file defines:

| Function | Purpose |
|----------|---------|
| `parse` | Converts raw input text to structured data |
| `part-1` | Solution to Part 1 |
| `part-2` | Solution to Part 2 |
| `-main` | Runs both parts from the command line |

## Running a Puzzle

### With **Clojure CLI**
```bash
clj -M -m aoc2015.day01
```

### With **Babashka**
```bash
bb -m aoc2015.day01
```

### From **Neovim + Clojure**
1. Open `src/aoc2015/day01.clj`
2. Evaluate the namespace form.
3. Evaluate forms inside the `(comment ... )` to explore solutions interactively.

## Philosophy

- **Pure first:** all logic is pure and REPL-friendly.
- **I/O at the edge:** file reading and printing live only in `-main`.
- **Self-documenting:** every namespace includes a small `(comment ...)` block with sample data and example usage.
- **Agnostic:** works equally in Clojure (JVM) and Babashka.

## Example (from 2015 Day 1)
```clojure
(comment
  (def sample "()())")
  (def parsed (parse sample))
  (part-1 parsed) ;; => 3
  (part-2 parsed) ;; => 5

  (def input (slurp-resource-or-file "event_2015/aoc2015-d01-input.txt"))
  (def data (parse input))
  [(part-1 data) (part-2 data)] ;; => [280 1797]
)
```

## Requirements
- Clojure CLI or Babashka
- JDK 11+ (for Clojure CLI)
- Neovim + Conjure (optional but recommended)
