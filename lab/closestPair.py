import sys


def closest_pair():
    """Input the string of array"""
    s = str(input("Input the string of array: "))
    s_list = s.split(",")
    num_list = con_string(s_list)
    find_closest(num_list)


def find_closest(num_list):
    """Find the closest pair"""
    closest = sys.maxsize
    subtract = [0]*len(num_list)
    for i in range(len(num_list)):
        if i < len(num_list)-1:
            temp = num_list[i]-num_list[i+1]
            if temp < 0:
                temp = -temp
            if temp < closest:
                 closest = temp
            subtract[i] = temp
    print_index(subtract, closest)


def print_index(subtract, closest):
    for i in range(len(subtract)):
        if subtract[i] is closest:
            print("Pair found at index ", i, " and ", (i+1))


def con_string(s_list):
    """Convert the string to the list of integer"""
    num_list = []
    for i in s_list:
        num_list.append(int(i))
    return num_list


closest_pair()