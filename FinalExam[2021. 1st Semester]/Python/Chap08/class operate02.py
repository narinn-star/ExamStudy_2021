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

    def __repr__(self):
        return "Card('{}', '{}')".format(self.rank, self.suit)

    def __eq__(self, other):
        return self.rank == other.rank and self.suit == other.suit

print(Card('3', '♠') == Card('3', '♠'))
print(Card('3', '♠') == eval(repr(Card('3', '♠'))))
