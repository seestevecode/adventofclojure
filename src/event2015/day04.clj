;;;; Advent of Code 2015 Day 4 - The Ideal Stocking Stuffer

(ns event2015.day04
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]
            [utils.main :refer [md5-hex]]))

(def puzzle-input (aoc/slurp-input 2015 4))

(defn- find-n
  [secret zeros]
  (let [prefix (apply str (repeat zeros "0"))]
    (loop [i 1]
      (if (.startsWith (md5-hex (str secret i)) prefix) i (recur (inc i))))))

(defn part-1 [input] (find-n input 5)) ; approx 3s
(defn part-2 [input] (find-n input 6)) ; approx 90s

(aoc/solve puzzle-input str/trim-newline part-1 part-2) ; [117946 3938038]

