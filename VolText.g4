/**
 * Define a grammar called Hello
 */
grammar VolText;

// match keyword hello followed by an identifier
pdf : 		A pdfattr* (stylesheet)? (page)+ C;
pdfattr: 	'title:' STRING ENDNLINE
	|		'author:' STRING ENDNLINE
	|		'path:' STRING ENDNLINE;

stylesheet: 'stylesheet' O element* C;
		
element: 	'@' STRING O attrStyle* C;
	
attrStyle: 	imganumber
	|		positionv
	|		txtval;
	
page: 		'page' O pae* C;

pae: 		pageattr | elemd | div;

div:		'div' O (imganumber | elemd | positionv)* C;
	
elemd: 		text 
	| 		list 
	| 		img;
	
img: 		'img' O imgattr* imgElem imgattr* C;

imgattr:	(idval | imganumber | positionv);

imgElem: 	'URL:' STRING ENDNLINE;

text: 		'text' O txtattr* txtElem? txtattr* C;

txtattr: 	(idval | imganumber | positionv | txtval);

txtElem: 	'String:' STRING ENDNLINE;

list: 		'list' O (listattr | listElem)* C;

listElem: 	'item:' STRING ENDNLINE;

//ATTRIBUTES

imganumber: ('pos-x'
		|	'pos-y'
		|	'angle-rotation'
		|	'h-img'
		|	'w-img'
		| 	'layer') ':' NVAL ENDNLINE;
		 
idval:		'id:' STRING ENDNLINE;

txtval:		'font-family:' STRING ENDNLINE 
	| 		'font-size' ':' NVAL ENDNLINE 
	| 		'color:' COLORVAL ENDNLINE 
	| 		TXTATF ':' TFVAL ENDNLINE;

positionv:	'position:' POSVAL ENDNLINE;

pageattr:	'orientation:' ('hor' | 'ver');
	
listattr: 	'ordered:' TFVAL ENDNLINE
	|		imganumber
	|		txtval
	|		positionv;

//TERMINALI

TXTATF: 	'bold'
	| 		'italics'
	|		'underline';

COLORVAL: 	'"#' ([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]) '"';

SVAL: 		[a-zA-Z]+;

TFVAL: 		'true' 
	| 		'false';

POSVAL: 	'lu' 
	| 		'cu' 
	| 		'ru' 
	| 		'lc' 
	| 		'cc' 
	| 		'rc' 
	| 		'lb' 
	| 		'cb' 
	| 		'rb' ;

NVAL: 		[0-9]+('.'[0-9]+)?;

ENDLINE: 	'";';
ENDNLINE: 	';';

O : 		':{';
A : 		'{';
C : 		'}';
		
STRING: 	'"' (~[\t\r\n])+ '"';

WS : 		[ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

