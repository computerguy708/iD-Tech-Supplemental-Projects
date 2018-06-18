
class MyPet:

    def __init__(self, pet_name):
        self.name = pet_name

    def pet(self):
        print("Your pet " + self.name + " seemed to be happy you pet them")

orange_cat = MyPet("Miles")
small_dog = MyPet("Fido")

print(orange_cat.name)
small_dog.pet()