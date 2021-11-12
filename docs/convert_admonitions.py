import os
import re
import shutil
import sys


def handle_admonition_line(line, whitespace):
    
    if (line.strip() == ""):
        results.write("\n")
        return line

    results.write(whitespace)
    
    # Replace all double back-ticks with singles
    line = line.replace("``","`")

    gt_split = line.split(">`_")

    if (len(gt_split) > 1):
        # Process the line and the link(s)
        
        i = 0
        for i, gt_split_elem in enumerate(gt_split):
            
            lt_split = gt_split_elem.split("<")
            
            if (len(lt_split) > 1):
                # Found the start of the link path
                
                # Find the start of the link text. Search backwards from the character closest to the link path.
                index_last_bt = lt_split[0].rfind("`")

                if (index_last_bt > 0):
                    pre_link_text = lt_split[0][0:index_last_bt]
                    if (i == 0):
                        # Strip leading whitespace from the line and use the given whitespace from the ```[label] line
                        results.write(pre_link_text.lstrip())
                    else:
                        results.write(pre_link_text)
                
                results.write("[")
                results.write(lt_split[0][index_last_bt + 1:].lstrip().rstrip()) # Remove trailing whitespace from the link text.
                results.write("]")
                
                results.write("(")
                results.write(lt_split[1])
                results.write(")")

            else:
                results.write(gt_split_elem)

    else:
        # No link. Just process the line.

        results.write(line.lstrip())

    return line


if __name__ == "__main__":

    if (len(sys.argv) < 2):
        print("Usage:\n\tpython convert_admonition.py article \n\nDescription:\n\tChanges a file's RST-style admonitions to MyST-style.")
        sys.exit()

    article = sys.argv[1]

    file = open(article)
    line_list = file.readlines()
    file.close()
    
    
    results = open(article, "w")

    print("First line:\n" + line_list[0])
    
    admonition = False
    whitespace = ""

    for line in line_list:
        if bool(admonition):
            # Inside admonition
            if line.lstrip().startswith("```"):
                results.write(line)
                admonition = False
            else:
                handle_admonition_line(line, whitespace)
                
        else:
            admon_split = ""
            label = ""

            if line.lstrip().startswith("```important"):
                label = "important"
                admonition = True

            elif line.lstrip().startswith("```note"):
                label = "note"
                admonition = True

            elif line.lstrip().startswith("```tip"):
                label = "tip"
                admonition = True

            elif line.lstrip().startswith("```warning"):
                label = "warning"
                admonition = True


            if (admonition == True):
                admon_split = line.split("```" + label)
                
                results.write(admon_split[0])
                results.write("```{" + label + "}\n")

                whitespace = admon_split[0]
                
            else:
                results.write(line)

    results.close()