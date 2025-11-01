;;;; Advent of Code 2015 Day 2 - I Was Told There Would Be No Math

(ns event2015.day02
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2015 2))

(def parsed str/split-lines)

(defn- parse-line [line] (vec (sort (mapv parse-long (str/split line #"x")))))

(defn- paper [[a b c]] (+ (* 3 a b) (* 2 a c) (* 2 b c))) ; 2(ab + ac + bc) + ab
(defn- ribbon [[a b c]] (+ (* 2 a) (* 2 b) (* a b c))) ; 2a + 2b + abc

(defn part-1 [input] (reduce #(+ %1 (paper (parse-line %2))) 0 (parsed input)))
(defn part-2 [input] (reduce #(+ %1 (ribbon (parse-line %2))) 0 (parsed input)))

(aoc/solve puzzle-input part-1 part-2) ; [1586300 3737498]

