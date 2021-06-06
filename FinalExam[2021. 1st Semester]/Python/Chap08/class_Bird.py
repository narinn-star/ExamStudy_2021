from class_Animal import Animal

class Bird(Animal):
    '새를 나타내는 클래스'
    
    def speak(self):
        '새 소리 출력'
        print('{}! '.format(self.language) * 3)

tweety = Bird()
tweety.setSpecies('canary')
tweety.setLanguage('tweet')
tweety.speak()

daffy = Bird()
daffy.setSpecies('duck')
daffy.setLanguage('quack')
daffy.speak()