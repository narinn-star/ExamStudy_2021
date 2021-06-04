text = "Time is Too Slow for those who Wait Too Swift for those who Fear Too Long for those who Grieve Too Short for those who Rejoice But for those who love Time is not"

def wordCount(text):
    words = text.split()
    setWords = set(words)
    print("문장 : \n", text)
    print("단어 수 : ", len(setWords))
    print(setWords)

wordCount(text)

