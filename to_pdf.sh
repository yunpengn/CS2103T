echo "Start to convert the file from Markdown format to PDF format..."
echo "Use pandoc for conversion. See https://pandoc.org/ for more information..."

# Use pandoc to convert markdown file to PDF file
# A few extra options we are using:
# 1. Specify the margin to be 0.9 inch
# 2. Use GitHub-favored Markdown syntax
pandoc software_engineering_complete.md -V geometry:margin=0.9in -f markdown_github -o software_engineering_complete.pdf

echo "Conversion completed."