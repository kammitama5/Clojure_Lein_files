;;callsigns
;;["Alfa" "Bravo" "Charlie"]

;;(nth callsigns 2)

;; => returns Charlie"

;; peek => get last item 
;; pop everything but last item

;; sequential destructuring
;; extra values get bound to nil

;;(let [[a b c d e f] stuff]
;;	(list d e f))

;; returns (10 11 nil)

;; persistent data structures
;; shared structures

;; O(n) in size of collection
;; nth on lists
;; last on anything

;;almost anything using sequences

;;o(1)
;; first, rest, peek, last

;;near constant time
;;o(log 32 n) => 32 way branching tree
;; most operations on vector, sets and maps
;; nth on vectors, but not on lists
;; peek on vectors but not last

;;(contains? [1 2]2 ) => would return False
;; asking is there anything in index 2 

;; assoc 
;;dissoc
;;into
;;reduce
;;keys
;;vals
;;merge
;;merge-with
;;update-in

;; get => (get scores "Cid")
;; and not in key/v pair, will return nil
;; if not used get => (scores "Cid")
;; will throw an exception

;;unless another arg specified
;;(get scores "Samwise" 0)
;; if "Samwise" not there, returns 0

;;keywords
;;(def m {:a 1 :b 2})
;;(m :b) => 2
;;(m : foo) => nil
;;(m : foo 50) => 50

;;keywords are functions of maps
;;(:a m) => 1

;; contains cares about associative 
;;data structures

;;(let [m {:a 1
;;	:b nil}])

;;(contains will tell diff between nil => 
;;	vs nil (not contained in set))

;;maps are unordered like sets

;;(zipmap players (repeat 0))
;;=> {"Kelly" 0, "Bob" 0, "Alice" 0}

;;(into {} (map (fn [player][player 0] players))
;; => {"Alice" 0, "Bob" 0, "Kelly" 0}

;;(def players #{Alice, bob, Kelly})
;;(into {} (for [player players]
	;;[player 0]))

;; maps as sequences of key value pairs

;; building a map with reduce
;;reduce (fn [m player]
	;; assoc m player 0))
;; {} ; initial value
;; players)

;;=> {"Kelly" 0, "Bob" 0, "Alice" 0}

;; assoc takes map key value

;;sorted map
;;(def sm(sorted-map
	;;"Bravo" 24
	;; "A" 1
	;; "C" 22
	;;"Dog" 5))

;;sm => {"A" 1, "Bravo" 24, "C" 22, "Dog" 5}

;;(let [m {:first "Craig"
	;;:last "Andera"
	;;:age 45
	;;"favourite" "Donuts"}
	;;{:keys [first last age height]} m
	;;{:strs [favourite]} m]
	;;[first last age height favourite])

;;docstring

;; try to put docstrings on all your functions

;; named arguments
;; transient => transient collections

;; in Cloujure -> ! => mutating
;; Convert back => Persistent!

;;(defn vrange [n]
	;;(loop [i 0
		;;v (transient [])]
		;;(if (< i n)
			;; recur (inc i) (conj! v i))
;;				(persistent! v)))

;;Review
;;
;;What are the keys of {:a 1 :b 2 :c 3}

;;(def m {:x 5})
;; How do we add a new mapping :y 10 to m?
;;assoc

;; How do we get a modified m with :x mapped to 4
;; merge, assoc
;; How do we remove the :x mapping from x?
;; dissoc


;;(let [person] {:first "Craig"
	;;:address {: street "Kilmarnock Dr."
	;;:number 9216}})
;;{:keys [first address]} person
;;{:keys [ street number]} address]
;;(get-in person [:address :street])
;;(assoc-in person [: address :street] "Oak Lane")
;; updates street to Oak Lane
