;;;; Advent of Code 2018 Day 1 - Chronal Calibration

(ns event2018.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]
            [utils.core :as util]))

(def puzzle-input (aoc/get-input 2018 1))

(defn- parsed [input] (map parse-long (str/split-lines input)))

(defn part-1 [input] (reduce + (parsed input)))
(defn part-2 [input] (util/first-dup (reductions + (cycle (parsed input)))))

(aoc/solve puzzle-input part-1 part-2) ; [508 549]

