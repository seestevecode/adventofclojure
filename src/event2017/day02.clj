;;;; Advent of Code 2017 Day 2 - Corruption Checksum

(ns event2017.day02
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2017 2))

(defn- parse-row [row] (map parse-long (str/split (str/trim row) #"\s+")))
(defn- parsed [input] (map parse-row (str/split-lines input)))

(defn- checksum-after [f rows] (transduce (map f) + 0 rows))

(defn- max-minus-min [nums] (- (apply max nums) (apply min nums)))
(defn- divisible-ratio
  [nums]
  (some (fn [[a b]] (when (zero? (mod a b)) (quot a b)))
        (for [a nums b nums :when (> a b)] [a b])))

(defn part-1 [input] (checksum-after max-minus-min (parsed input)))
(defn part-2 [input] (checksum-after divisible-ratio (parsed input)))

(aoc/solve puzzle-input part-1 part-2) ; [53460 282]

