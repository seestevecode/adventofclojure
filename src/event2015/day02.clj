;;;; Advent of Code 2015 Day 2 - I Was Told There Would Be No Math

(ns event2015.day02
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/slurp-input 2015 2))

(defn- parse-line [line] (sort (map parse-long (str/split line #"x"))))
(defn- parse [input] (map parse-line (str/split-lines input)))

(defn- paper [[a b c]] (+ (* 2 a b) (* 2 a c) (* 2 b c) (* a b))) ; 2ab + 2ac + 2bc + ab
(defn- ribbon [[a b c]] (+ (* 2 a) (* 2 b) (* a b c))) ; 2a + 2b + abc

(defn part-1 [input] (reduce + 0 (map paper input)))
(defn part-2 [input] (reduce + 0 (map ribbon input)))

(aoc/solve puzzle-input parse part-1 part-2) ; [1586300 3737498]

