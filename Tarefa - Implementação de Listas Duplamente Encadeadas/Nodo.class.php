<?php
	/**
	* Implement a nodo of an ordened list.
	*/
	class Nodo
	{
		private $value; // The value inside of the item; Any type.
		private $next; // The next nodo inside the list; Nodo type.
		private $previous; // The previous nodo inside the list; Nodo type.

		/**
		*
		*/
		function __construct($value)
		{
			$this->value = $value;
		}

		function getValue() {
			return $value;
		}

		function setValue($value) {
			$this->value = $value;
		}

		function getNext() {
			return $next;
		}

		function setNext($next) {
			$this->next = $next;
		}

		function getPrevious() {
			return $previous;
		}

		function setPrevious($previous) {
			$this->previous = $previous;
		}
	}
?>