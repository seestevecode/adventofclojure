(ns aoc2015.day03
  "Advent of Code 2015 Day 3 - Perfectly Spherical Houses in a Vacuum"
  (:require [clojure.string :as str]
            [clojure.set :as set]))

(def ^:private input (slurp "resources/event_2015/aoc2015-d03-input.txt"))
(def ^:private parsed (str/trim-newline input))

(def ^:private move-map {\^ [0 -1], \> [1 0], \v [0 1], \< [-1 0]})
(defn- visited [moves] (set (reductions #(map + %1 (move-map %2)) [0 0] moves)))

(defn part-1 [input] (count (visited input)))
(defn part-2
  [input]
  (let [santa-visited (visited (take-nth 2 input))
        robot-visited (visited (take-nth 2 (rest input)))]
    (count (set/union santa-visited robot-visited))))

;; Solutions: 2081 / 2341
(str "Solutions: " (part-1 parsed) " / " (part-2 parsed))

