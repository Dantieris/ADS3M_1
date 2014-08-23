<?php
	/**
	* Implement an ordened list.
	*/
	include(Nodo);
	class List extends AnotherClass
	{
		
		private $head; // The begining of the list; Nodo type.
		private $tail; // The ending of the list; Nodo type.

		function __construct(argument)
		{
			# code...
		}

		function insert($value) {
			$newNodo = new Nodo($value);

			if(isEmpty()) {
				$this->head = $newNodo;
				$this->tail = $newNodo;
			}
			else {
				$nextNodo = findNext($value);
				if(!is_null($nextNodo)) {
					$newNodo->setNext($nextNodo);
					$newNodo->setPrevious($nextNodo->getPrevious);

					if(!is_null($newNodo->getPrevious)) {
						$newNodo->getPrevious->setPrevious($newNodo);
					} else {
						$this->head = $newNodo;
					}
					$newNodo->getNext->setPrevious($newNodo);
				}
				else {
					$newNodo->setNext(null);
					$newNodo->setPrevious($this->tail);
				}
			}
		}

		function remove() {

		}

		function search() {

		}

		private function isEmpty() {
			if(is_null($this->head)) {
				return true;
			} else {
				return false;
			}
		}

		private function findNext($value) {
			$iter = $this->head;

			while (!is_null($this->head)) {
				if($iter->getValue() < $value) {
					return $iter;
				}

				$iter = $iter->getNext;
			}
		}
	}
?>