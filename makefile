
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:        
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        Adult.java \
        Child.java \
        Journey.java \
        Passenger.java \
	Senior.java \
	Student.java \
	Ticket.java \
	Train.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class


