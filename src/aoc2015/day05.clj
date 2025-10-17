(ns aoc2015.day05
  "Advent of Code 2015 Day 5 - Doesn't He Have Intern-Elves For This?"
  (:require [clojure.string :as str]))

(def puzzle-input (slurp "resources/event_2015/aoc2015-d05-input.txt"))

(defn- nice-part1?
  [s]
  (and (>= (count (re-seq #"[aeiou]" s)) 3) ; at least 3 vowels
       (re-find #"(.)\1" s) ; adjacent pair
       (not (re-find #"ab|cd|pq|xy" s)))) ; no bad pair

(defn- nice-part2?
  [s]
  (and (re-find #"(..).*\1" s) ; two adjacent pairs
       (re-find #"(.).\1" s))) ; sandwich

(defn part-1 [input] (count (filter nice-part1? (str/split-lines input))))
(defn part-2 [input] (count (filter nice-part2? (str/split-lines input))))

(comment
  ;; Solutions: 255 / 55
  (let [input puzzle-input]
    (str "Solutions: " (part-1 input) " / " (part-2 input))))

