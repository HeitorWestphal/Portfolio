#!/bin/bash
if [ $1 -lt $2 ]
then
	echo "$2 é maior"
elif [ $2 -lt $1 ]
then
	echo "$1 é maior"
fi

echo "A soma deles é de: " $(($1+$2))

