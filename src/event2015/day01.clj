;;;; Advent of Code 2015 Day 1 - Not Quite Lisp

(ns event2015.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2015 1))

(defn- parsed [input] (mapv {\( 1, \) -1} (str/trim-newline input)))

(defn part-1 [input] (reduce + (parsed input)))
(defn part-2
  [input]
  (count (take-while #(not (neg? %)) (reductions + 0 (parsed input)))))

(aoc/solve puzzle-input part-1 part-2) ; [280 1797]

