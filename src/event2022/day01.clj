;;;; Advent of Code 2022 Day 1 - Calorie Counting

(ns event2022.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2022 1))

(defn- parsed
  [input]
  (map #(map parse-long (str/split-lines %))
    (str/split (str/trim-newline input) #"\n\n")))

(defn- sorted-totals [vs] (sort (map #(reduce + %) (parsed vs))))

(defn part-1 [input] (last (sorted-totals input)))
(defn part-2 [input] (reduce + (take-last 3 (sorted-totals input))))

(aoc/solve puzzle-input part-1 part-2) ; [70509 208567]

