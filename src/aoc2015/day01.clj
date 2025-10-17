(ns aoc2015.day01
  "Advent of Code 2015 Day 1 - Not Quite Lisp"
  (:require [clojure.string :as str]))

(def test-input "(()))(")
(def puzzle-input (slurp "resources/event_2015/aoc2015-d01-input.txt"))

(defn- parse [input] (mapv {\( 1, \) -1} (str/trim-newline input)))

(defn part-1 [input] (reduce + input))
(defn part-2
  [input]
  (count (take-while (complement neg?) (reductions + 0 input))))

(comment
  ;; Solutions: 280 / 1797
  (let [input puzzle-input] ; change as required
    (str "Solutions: " (part-1 (parse input)) " / " (part-2 (parse input)))))
