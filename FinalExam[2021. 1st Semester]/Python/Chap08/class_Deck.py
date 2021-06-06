from random import shuffle
from class_Card import Card

class Deck:
    ranks = {'2', '3', '4','5','6','7','8','9','10','J','Q','K','A'}
    suits = {'\u2660', '\u2661', '\u2662', '\u2663'}

    def __init__(self, cardList = None):
        self.deck = []

        if cardList != None:
            self.deck = cardList
        else:
            for suit in Deck.suits:
                for rank in Deck.ranks:
                    self.deck.append(Card(rank, suit))

    def dealCard(self):
        print(self.deck.pop(0))

    def shuffle(self):
        shuffle(self.deck)

deck = Deck(['1','2','3','4'])
deck.shuffle()
deck.dealCard()
deck.dealCard()

print('=================')

d = Deck()
deck.shuffle()
deck.dealCard()
deck.dealCard()