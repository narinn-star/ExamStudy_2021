class Animal:
    def setSpecies(self, species):
        self.species = species

    def setLanguage(self, language):
        self.language = language

    def speak(self):
        print("I am a {} and I {}.".format(self.species, self.language))

# snoopy = Animal()
# snoopy.setSpecies('dog')
# snoopy.setLanguage('bark')
# snoopy.speak()
