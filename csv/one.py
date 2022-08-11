import csv



with open('date/origin.csv' ) as csv_file:
    csv_reader = csv.reader(csv_file, delimiter=',')
    writer = csv.writer(open('date/result.csv', 'w', newline=''))
    writer.writerow(["year", "region", "value"])
    next(csv_reader,None)
    for row in csv_reader:
        writer.writerow((row[0]+"-01-01",row[1],row[2]))

