read X
printf "%.3f" $(echo "scale = 5; $X" | bc -l)