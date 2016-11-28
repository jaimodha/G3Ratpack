package g3summit

import ratpack.handling.Context
import ratpack.render.RendererSupport
import static ratpack.jackson.Jackson.json;
import static ratpack.handlebars.Template.handlebarsTemplate;

class BookRenederer extends RendererSupport<Book>{

    @Override
    void render(Context ctx, Book book) throws Exception {

        ctx.byContent{ c -> c
            .html{
            ctx.render(handlebarsTemplate("book", book, "text/html"))
            }
            .json{
            ctx.render(json(book))
            }
            .noMatch("text/html")
        }
    }
}