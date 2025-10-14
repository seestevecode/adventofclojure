(ns aoc2015.day02
  "Advent of Code 2015 Day 2 - I Was Told There Would Be No Math"
  (:require [clojure.string :as str]))

(def ^:private input (slurp "resources/event_2015/aoc2015-d02-input.txt"))
(def ^:private parsed (str/split-lines input))
(defn- parse-line [line] (vec (sort (mapv parse-long (str/split line #"x")))))

(defn- paper [[a b c]] (+ (* 3 a b) (* 2 a c) (* 2 b c))) ; 2(ab + ac + bc) + ab
(defn- ribbon [[a b c]] (+ (* 2 a) (* 2 b) (* a b c))) ; 2a + 2b + abc

(defn part-1 [input] (reduce #(+ %1 (paper (parse-line %2))) 0 input))
(defn part-2 [input] (reduce #(+ %1 (ribbon (parse-line %2))) 0 input))

;; Solutions: 1586300 / 3737498
(str "Solutions: " (part-1 parsed) " / " (part-2 parsed))

