class Card:
    def __init__(self, rank, suit):
        '게임용 카드의 숫자패와 무늬패를 초기화'
        self.rank = rank
        self.suit = suit
    
    def getRank(self):
        '숫자패 반환'
        return self.rank
    
    def gerSuit(self):
        '무늬패 반환'
        return self.suit

