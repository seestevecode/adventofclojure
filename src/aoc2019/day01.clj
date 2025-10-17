(ns aoc2019.day01
  "Advent of Code 2019 Day 1 - The Tyranny of the Rocket Equation"
  (:require [clojure.string :as str]))

(def puzzle-input (slurp "resources/event_2019/aoc2019-d01-input.txt"))

(defn- parse [input] (map parse-long (str/split-lines input)))

(defn- base-fuel "Base fuel for mass." [mass] (- (quot mass 3) 2))
(defn- total-fuel
  "Total fuel required for mass including fuel mass."
  [mass]
  (reduce + 0 (take-while pos? (rest (iterate base-fuel mass)))))

(defn part-1 [input] (reduce + (map base-fuel input)))
(defn part-2 [input] (reduce + (map total-fuel input)))

(comment
  ;; Solutions: 3376887 / 5026623
  (let [input puzzle-input]
    (str "Solutions: " (part-1 (parse input)) " / " (part-2 (parse input)))))

