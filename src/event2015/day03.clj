;;;; Advent of Code 2015 Day 3 - Perfectly Spherical Houses in a Vacuum

(ns event2015.day03
  (:require [clojure.set :as set]
            [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/slurp-input 2015 3))

(def move-map {\^ [0 -1], \> [1 0], \v [0 1], \< [-1 0]})
(defn- visited [input] (set (reductions #(map + %1 (move-map %2)) [0 0] input)))

(defn part-1 [input] (count (visited input)))
(defn part-2
  [input]
  (let [santa-visited (visited (take-nth 2 input))
        robo-santa-visited (visited (take-nth 2 (rest input)))]
    (count (set/union santa-visited robo-santa-visited))))

(aoc/solve puzzle-input str/trim-newline part-1 part-2) ; [2081 2341]

