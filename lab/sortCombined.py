def sort_combine():
    """Sorting combined two sorted arrays"""
    s1 = input_string()
    s2 = input_string()
    num_1 = con_string(s1)
    num_2 = con_string(s2)
    combined_num = combine(num_1, num_2)
    s = con_list(combined_num)
    print(s)


def con_list(num):
    """Converting the list to the string of integer"""
    s_list = [str(i) for i in num]
    s = ','.join(s_list)
    return s


def combine(num_1, num_2):
    """Combined and Sorted"""
    len_1 = len(num_1)
    len_2 = len(num_2)
    combined_num = [0]*(len_1+len_2)
    temp, temp_1, temp_2 = 0, 0, 0
    while temp_1 < len_1 and temp_2 < len_2:
        if num_1[temp_1] < num_2[temp_2]:
            combined_num[temp] = num_1[temp_1]
            temp_1 += 1
        else:
            combined_num[temp] = num_2[temp_2]
            temp_2 += 1
        temp += 1
    while temp_1 < len_1:
        combined_num[temp] = num_1[temp_1]
        temp += 1
        temp_1 += 1
    while temp_2 < len_2:
        combined_num[temp] = num_2[temp_2]
        temp += 1
        temp_2 += 1
    return combined_num


def con_string(s):
    """Converting the string to the list of integer"""
    s_list = s.split(",")
    num_list = []
    for i in s_list:
        num_list.append(int(i))
    return num_list


def input_string():
    """Input the string of array"""
    s = str(input("Input the string of array: "))
    return s


sort_combine()
