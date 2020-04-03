class Person:
  
  def __init__(self, first, last):
    self.first = first
    self.last = last
    
  def fullname(self):
    return self.first + " " + self.last
    
person = Person("Eashan", "Chauhan")
print(person.fullname())
  
