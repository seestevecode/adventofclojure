(ns aoc2015.day01
  "Advent of Code 2015 Day 1 - Not Quite Lisp"
  (:require [clojure.string :as str]))

(def ^:private input (slurp "resources/event_2015/aoc2015-d01-input.txt"))
(def ^:private parsed (mapv {\( 1, \) -1} (str/trim-newline input)))

(defn part-1 [s] (reduce + s))
(defn part-2 [s] (count (take-while (complement neg?) (reductions + 0 s))))

;; Solutions: 280 / 1797
(str "Solutions: " (part-1 parsed) " / " (part-2 parsed))

