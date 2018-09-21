read x

if [ $x == "y" -o $x == "Y" ] ; then
	echo "YES"
fi

if [ $x == "n" -o $x == "N" ] ; then
	echo "NO"
fi