;;;; Advent of Code 2015 Day 5 - Doesn't He Have Intern-Elves For This?

(ns event2015.day05
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/slurp-input 2015 5))

(def nice-1?
  (every-pred #(<= 3 (count (re-seq #"[aeiou]" %)))
              #(re-find #"(.)\1" %)
              #(not (re-find #"ab|cd|pq|xy" %))))

(def nice-2? (every-pred #(re-find #"(..).*\1" %) #(re-find #"(.).\1" %)))

(defn part-1 [input] (count (filter nice-1? input)))
(defn part-2 [input] (count (filter nice-2? input)))

(aoc/solve puzzle-input str/split-lines part-1 part-2) ; [255 55]

