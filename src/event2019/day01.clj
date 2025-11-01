;;;; Advent of Code 2019 Day 1 - The Tyranny of the Rocket Equation

(ns event2019.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2019 1))

(defn- parsed [input] (map parse-long (str/split-lines input)))

(defn- base-fuel [mass] (- (quot mass 3) 2))
(defn- total-fuel
  [mass]
  (reduce + 0 (take-while pos? (rest (iterate base-fuel mass)))))

(defn part-1 [input] (reduce + (map base-fuel (parsed input))))
(defn part-2 [input] (reduce + (map total-fuel (parsed input))))

(aoc/solve puzzle-input part-1 part-2) ; [3376997 5062623]

