import time

def linearAlgorithm(n): 
    a = 0                   # setting iteration value to 0
    for i in range(0,n):    # loop the function according to our 'n' number
        a=a+1
        print("Loading: ", a)       # print the a value for each loop

starttime = time.time()     # record the start time of the program
n = 10000000
linearAlgorithm(n)
endtime = time.time()       # record the end time of the program
elapsedtime = endtime - starttime # find the time difference
print('Time executed: ', elapsedtime, 'secs')