(ns aoc2017.day02
  "Advent of Code 2017 Day 2 - Corruption Checksum"
  (:require [clojure.string :as str]))

(def puzzle-input (slurp "resources/event_2017/aoc2017-d02-input.txt"))

(defn- parse-row [row] (map parse-long (str/split (str/trim row) #"\s+")))

(defn- max-minus-min [nums] (- (apply max nums) (apply min nums)))
(defn- divisible-ratio
  [nums]
  (some (fn [[a b]] (when (and (> a b) (zero? (mod a b))) (quot a b)))
        (for [a nums b nums] [a b])))

(defn- apply-to-rows
  [func input]
  (reduce + 0 (map func (map parse-row (str/split-lines input)))))

(defn part-1 [input] (apply-to-rows max-minus-min input))
(defn part-2 [input] (apply-to-rows divisible-ratio input))

(comment
  ;; Solutions: 53460 / 282
  (let [input puzzle-input]
    (str "Solutions: " (part-1 input) " / " (part-2 input))))

