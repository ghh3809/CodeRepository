#!/bin/bash

# Get startDate and finalDate.
executeDate=${1}	# Current execute date
finalDate=${2}		# Final execute date
stepDay=${3:-1}		# Day step to execute
inverseFlag=false	# If false, the date is going larger, and vise versa.

# Determine which is larger. If startDate is larger, change stepDay to negative.
if [ ${executeDate} -gt ${finalDate} ]
then
	inverseFlag=true
	if [ ${stepDay} -gt 0 ]
	then
		stepDay=`expr 0 - ${stepDay}`
	fi
fi

# Loop your code.
while [ ${executeDate} -le ${finalDate} -a ${inverseFlag} == false -o ${executeDate} -ge ${finalDate} -a ${inverseFlag} == true ]
do
	
	# Print information of date.
	echo "**********************"
	echo "Execute date: ${executeDate}"
	echo "**********************"

	# Your code here
	# #############################
	# Your code here
	
	# Print information of date.
	echo "****************************************"
	echo "Date ${executeDate} has already been executed."
	echo "****************************************"

	# Change to next day
	executeDate=`date +"%Y%m%d" -d "${stepDay}day ${executeDate}"`

done

# Final information.
echo "Program finished!"

