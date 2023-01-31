<#import '../layout.ftlh' as l>

<@l.layout titre="Movie - Create">
    <p>${.now}</p>
    <form action="/Movie/create" method="post">
        <div class="input-field">
            <label for="title">Titre</label>
            <#if errors["Title"] ??>
                <input type="text" name="Title" id="Title">
                <div class="red-text">
                    ${errors["Title"]}
                </div>
            </#if>
        </div>
        <div class="input-field">
            <label for="lastname">Lastname</label>
            <input type="text" name="lastname" id="lastname">
        </div>
        <button type="submit" class="btn success">Add</button>
    </form>
</@l.layout>