# Namra  Sanjay Patel
# CWID - 20011070

class Time:
    def __init__(self, hour, minute):
        assert 0 <= hour <= 23 and 0 <= minute <= 59, "Invalid Time"
        self.hour = hour
        self.minute = minute


    def __str__(self):
        return "{:02d}".format(self.hour) + ":" + "{:02d}".format(self.minute)
    

    def __eq__(self, other):
        if self.hour == other.hour and self.minute == other.minute:
            return True
        else:
            return False
    

    def isAfterNoon(self):
        if self.hour >= 12:
            return True
        else:
            return False


    def isBefore(self, t2):
        if self.hour < t2.hour:
            return True
        elif self.hour == t2.hour and self.minute < t2.minute:
            return True
        else:
            return False
    

    def tick(self):
        if self.minute == 59:
            self.minute = 0
            if self.hour == 23:
                self.hour = 0
            else:
                self.hour += 1
        else:
            self.minute += 1
    

    def shortTimeApart(self, other):
        min_diff = abs((self.minute + (self.hour * 60)) - (other.minute + (other.hour * 60)))
        min_diff = min(min_diff, ((24 * 60) - min_diff))
        return "{:02d}".format(min_diff // 60) + ":" + "{:02d}".format(min_diff % 60)
    
    
    def longTimeApart(self,other):
        min_diff = abs((self.minute + (self.hour * 60)) - ((other.minute + other.hour * 60)))
        return "{:>02d}".format(min_diff // 60) + ":" + "{:>02d}".format(min_diff % 60)
    

# t1 = Time(0, 1)
# t2 = Time(23,59)
# print(t1.shortTimeApart(t2))
# d = Time(1,21)
# print(str(d))
    
# t1 = Time(11,21)
# t2 = Time(11,21)
# t3 = Time(11,22)
# print(t1 == t2)
# print(t1 == t3)

# t1 = Time(11,21)
# t2 = Time(13,22)
# print(t1.isAfterNoon())
# print(t2.isAfterNoon())

# t1 = Time(11,21)
# t2 = Time(15,23)
# print(t1.isBefore(t2))
# print(t2.isBefore(t1))
# print(t1.isBefore(t1))

# t = Time(10,59)
# print(str(t))
# t.tick()
# print(str(t))

# t1 = Time(23,59)
# t2 = Time(0, 1)
# print(t1.shortTimeApart(t2))
# print(t2.shortTimeApart(t1))

# t1 = Time(23,59)
# t2 = Time(0, 1)
# print(t1.longTimeApart(t2))
# print(t2.longTimeApart(t1))
