;;;; Advent of Code 2024 Day 1 - Historian Hysteria

(ns event2024.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2024 1))

(defn- parsed
  [input]
  (->> input
       str/split-lines
       (mapv #(mapv parse-long (str/split % #"\s+"))) ; parse lines
       (apply mapv vector) ; transpose
       (mapv (comp vec sort))))

(defn- left [input] (first (parsed input)))
(defn- right [input] (second (parsed input)))
(defn- right-freqs [input] (frequencies (right input)))

(defn part-1
  [input]
  (reduce + (map #(abs (- %1 %2)) (left input) (right input))))
(defn part-2
  [input]
  (reduce + (map #(* % (get (right-freqs input) % 0)) (left input))))

(aoc/solve puzzle-input part-1 part-2) ; [3714264 18805872]

