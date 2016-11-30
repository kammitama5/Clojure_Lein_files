(update-in
	(assoc
		(get
			(get m :k)
			:k2)
		:k3 val)
	[:k4 :k5]
	inc)

;; macros have ability to re-write code
;; thread-first macro => 
;; threading expressions through series
;; of other ones

;; thread-first vs thread-last

(-> m
	(get :k)
	(get :k2)
	(assoc :k3 val)
	(update-in [:k4 :k5] inc))

;; prototypes => like typeclasses in Haskell

;; Records => have a named type 
;; => can have polymorphic behavior

;;positional takes all four arguments
;;map constructure takes at least one but doesn't
;;have to be filled => would fill in nil

;;class in other languages => usually
;; call for a map in Clojure

;; turn into a vector => (vec '()')
;;turn into a set (set [1 2])
;; turn into a list => (list* [])
;;turn into a map => use apply

;; conj a pair for map

;; lists are sequences, but not all
;; sequences are lists

;; can turn a vector into seq
;; (seq [1 2 3]) => seq? [1 2 3] = True

;; for is nested, map is parallel


(sort '(10 37 3 10 44 6)) ;; => sort is not lazy
;; prints (3 6 10 10 37 44)
(sort (fn [x y] (- (compare x y))) '(10 37 3 10 44 6))
;; prints (44 37 10 10 6 3)


;; partition vs partition-all
;;partition drops what can't be partitioned
;;partition-all will return even numbers
;;that cannot be partitioned

;;(group-by (fn [n] (if (even? n) :even :odd))
	;;range 10))

;; returns {:even[0, 2, 4, 6, 8] :odd[1, 3, 5, 7, 9]}

;; (map (fn [i] (range i)) (range 7))
;;(() (0) (0 1 ) ... (0 1 2 3 4 5))

;;mapcat
;;(mapcat (fn [i] (range i)) (range 7))
;;(0 0 1 0 1 2 0 1 2 ...5)

;;(interpose \, "abc") => (\a \, \b...)
;;(apply str *1) => "a, b ,c"

;;(iterate)

;; vectors are not lazy

;;(apply str (interpose \, (range 4)))
;;prints  "0, 1, 2, 3"

;;(into () [:a :b :c])
;; prints (:c :b :a)

;;O(n) on a seq => last, butlast
;;O(1) on a vector => peek, pop 

;; holding the head of a sequences

;; lazy seq produces a lazy sequence

;; thread last for readability

