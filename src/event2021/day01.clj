;;;; Advent of Code 2021 Day 1 - Sonar Sweep

(ns event2021.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2021 1))

(defn- parsed [input] (map parse-long (str/split-lines input)))

(defn- count-incs-by-offset
  [offset input]
  (let [p (parsed input)] (count (filter identity (map < p (drop offset p))))))

(defn part-1 [input] (count-incs-by-offset 1 input))
(defn part-2 [input] (count-incs-by-offset 3 input)) ; ignoring the overlaps

(aoc/solve puzzle-input part-1 part-2) ; [1759 1805]

