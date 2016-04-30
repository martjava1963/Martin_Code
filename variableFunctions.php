<?php 

/*																	**PHP PROGRAMMING**
--------------------------------------------------------------------------------------------------------------------------------------------------------
																		*NOTES*
	Variable Functions - allow us to take input from somewhere
	and call any kind of function that pre-exist's 	based off of a string
	variable value.	ie: $func = 'add_up'; or $func = 'answer';

	
	
--------------------------------------------------------------------------------------------------------------------------------------------------------
 */

/*==============================================================FUNCTION DEFINITIONS BEGIN=========================================================*/

// VARIABLE FUNCTIONS
function answer() {
	return 45;	
}

function add_up($a, $b) {
	return $a + $b;
}

function subtractNums($a, $b) {
	return $a - $b; 
	
}

//PHP CLOSURES or anonymous functions - can't access things outside the function definition or scope...

$name = 'Marty';   // this is the solution for that dilemma....declare a variable outside the function scope and use it in the function by using the use keyword
$greet = function() use ($name) {
	echo "Hello There, $name.";  // must use double qoutes because single quotes don't do evaluations...we need to evaluate $name
	echo '<br>';
	echo '<br>';
	echo "\n\nTesting Sublime Text Editor!";	
};



/*==========================PHP STRING FUNCTIONS==========================*/
	// PHP is zero-based index
	$phrase = "We only hit what we aim for";

	// strlen()
	$len = strlen($phrase);

	
    // string substr ( string $string , int $start [, int $length ] ) the brackets mean the 3rd parameter is optional...
    // Returns the portion of string specified by the start and length parameters.
	//echo substr($phrase, 0, 5);


	// accept's mixed data types...int and string
	//mixed strpos ( string $haystack , mixed $needle [, int $offset = 0 ] )
    //Find the numeric position of the first occurrence of needle in the haystack string.

    /*==OUTPUTS==*/
    //echo strpos($phrase, 'hit');
    //echo "<br>";
    //var_dump(strpos($phrase, 'bla bla')); // non-existent string so function returns false

    //echo "<br>";
    $start = strpos($phrase, 'hit');
    //echo substr($phrase, $start);


/*==========================PHP ARRAY FUNCTIONS==========================*/

// array_keys()
//array array_keys ( array $array [, mixed $search_value = null [, bool $strict = false ]] )
//array_keys() returns the keys, numeric and string, from the array.


// associative array   -- Key => value pairs...
$names = array(
	'Mike' => 'Tech',
	'John' => 'Candle Maker',
	'Tina' => 'Programmer',
	'Matias' => 'BeerMeister',
	'Susanne' => 'Singer',
	'Roy' => 'Contruction worker',
	);

	/*====OUTPUT====*/

 	//var_dump(array_keys($names));
 	//echo "<br>";
 	//echo "<br>";

 	//foreach (array_keys($names) as $name) {
 	//	echo " Hello, $name";
 	//	echo "<br>";
 //	}

//user-defined callback function
function print_info($value, $key) {  // passing key and value pair
	echo "$key is a $value.<br>";


}
														// optional third parameter 
//bool array_walk ( array &$array , callable $callback [, mixed $userdata = NULL ] )
//Applies the user-defined callback function to each element of the array.
array_walk($names, 'print_info'); // passing the array, and the callback function which print's the content of the array.




/*==========================================================FUNCTION DEFINITIONS END==========================================================================*/



/*----assign variable functions to variable----*/

//$func = 'answer';

//$func = 'add_up';

$func = 'subtractNums';





/*=========================OUTPUTS BEGIN=================================*/

// VARIABLE FUNCTIONS OUTPUT
/*----call the function----*/ 

//echo $func();


// another way to do the same result
//$num = $func(10,200);

//echo "Num = " . $num;


//PHP CLOSURES OUTPUT
/*----call the function----*/ 

//$greet();

//PHP STRING FUNCTIONS OUTPUT 
//echo "The string length of the phrase is: " . $len;


/*==========================OUTPUTS END==================================*/


?>
