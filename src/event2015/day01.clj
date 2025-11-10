;;;; Advent of Code 2015 Day 1 - Not Quite Lisp

(ns event2015.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/slurp-input 2015 1))

(defn- parse [input] (mapv {\( 1, \) -1} (str/trim-newline input)))

(defn part-1 [input] (reduce + 0 input))
(defn part-2
  [input]
  (count (take-while #(not (neg? %)) (reductions + 0 input))))

(aoc/solve puzzle-input parse part-1 part-2) ; [280 1797]

