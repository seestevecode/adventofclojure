# Advent of Clojure

## Goals

... in no particular order

- Solving as many Advent of Code problems as I can, from 2015 to 2024
- Improving my knowledge of data structures and algorithms
- Learning Clojure
- Writing idiomatic and declarative code
- Having fun and distracting myself from real life for a while!

## Solutions

| Day | 2015 | 2016 | 2017 | 2018 | 2019 | 2020 | 2021 | 2022 | 2023 | 2024 | Total |
| --: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | :--: | ----: |
|   1 |      |      |      |      |      |      |      |      |      |      |       |
|   2 |      |      |      |      |      |      |      |      |      |      |       |
|   3 |      |      |      |      |      |      |      |      |      |      |       |
|   4 |      |      |      |      |      |      |      |      |      |      |       |
|   5 |      |      |      |      |      |      |      |      |      |      |       |
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

## Directory structure

```
. adventofcode/
├── adventofclojure/ <--- THIS REPO
│   ├── event2015/
│   │   ├── day01.clj
│   │   └── ...
│   ├── ...
│   ├── event2024/
│   └── README.md
└── inputs/ <--- NOT INCLUDED IN THIS REPO
   ├── inputs_2015/
   │   ├── aoc2015_d01.txt
   │   └── ...
   ├── ...
   └── inputs_2024/
```

## Running a program

I am using Babashka for running my Clojure scripts. Each program should be run by piping the relevant input file to STDIN. This should work for both Linux and Windows.

e.g. running from the `adventofclojure/` parent directory (YMMV):

```bash
bb event2015/day01.clj < ../inputs/inputs_2015/aoc2015_d01.txt
```
