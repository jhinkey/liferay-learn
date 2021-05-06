var=$(echo "@slurp : 55 : 1 : 22 " | awk -F ':' '{print $2}' | xargs); re='^[0-9]+$'; if ! [[ $var =~ $re ]]; then echo "error"; else echo "num: $var";fi

