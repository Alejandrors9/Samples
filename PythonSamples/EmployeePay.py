#Alejandro Ruiz-Serrano
#2/9
#Practice Problems Part 2
#EmployeePay
name=input("Enter employee Name: ")
hours=float(input("Enter number of hours worked: "))
payRate=float(input("Hourly Pay Rate: "))
fedTax=float(input("Enter federal tax withholding rate: "))
stateTax=float(input("Enter state tax withholding rate: "))

gross = round(hours * payRate,2)
fedTotal = round(gross * fedTax,2)
stateTotal = round(gross * stateTax,2)
taxTotal = round(fedTotal + stateTotal,2)
netPay = round(gross - taxTotal,2)

print("\nEmployee Name: ", name,
"\nHours Worked: ", hours,
"\nPay Rate: $", payRate,
"\nGross Pay: $", gross,
"\nDeductions:",
"\n\tFederal Withholding (", fedTax*100, "%): $", fedTotal,
"\n\tState Withholding (",stateTax*100,"%): $", stateTotal,
"\n\tTotal Deductions: $", taxTotal,
"\nNet Pay: $", netPay, sep="")
